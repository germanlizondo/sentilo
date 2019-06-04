<%@ taglib prefix="sensor" tagdir="/WEB-INF/tags" %>

<jsp:include page="../shared/head.jsp" />
<jsp:include page="../shared/sidenav.jsp" />
<jsp:include page="../shared/navbar.jsp"/>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script ></script>

<div class="container">
    <div class="row mt-5">

        <div class="col-xl-6 col-lg-6 col-md-12">

            <div class="columna" style="padding: 1em;">
                <sensor:tituloSensor/>
            </div>



        </div>
    </div>

    <div class="row mt-5">

        <div class="col-xl-12 col-lg-12 col-md-12">
            <div class="columna mb-5" style="padding: 1em;">
                <i id="reload-button" class="fas fa-sync-alt" style="cursor: pointer"></i>
                <canvas id="line-chart" width="800" height="250"></canvas>
            </div>



        </div>
    </div>



</div>

<script>

    var xhr;
    var reloadbutton = document.getElementById("reload-button");
    function init() {
        try {
            // Firefox, Opera 8.0+, Safari, Chrome
            xhr = new XMLHttpRequest();
        } catch (e) {
            // Internet Explorer
            try {
                xhr = new ActiveXObject("Msxml2.XMLHTTP");
                //ie6+
            } catch (e) {
                try {
                    xhr = new ActiveXObject("Microsoft.XMLHTTP");
                    //ie5
                } catch (e) {
                    alert("El teu navegador no suporta AJAX!");
                    return false;
                }
            }
        }

        reloadbutton.addEventListener("click",cargaGrafic,true);
        cargaGrafic();
    }

    function cargaGrafic() {

        var json;
        var data;
        //callback
        xhr.onreadystatechange = function() {
            if (xhr.readyState == 4) {
                json = JSON.parse(xhr.responseText);
                var today = new Date();
                var hours = today.getHours();
                var min = today.getMinutes();
                var sec = today.getSeconds();

                new Chart(document.getElementById("line-chart"), {
                    type: 'line',
                    data: {
                        labels: [,1600,1700,1750,1800,1850,1900,1950,1999,hours+":"+min+":"+sec],
                        datasets: [{
                            label:"Data",
                            data: json.data,
                            borderColor: "#3e95cd",
                            fill: false
                        }
                        ]
                    }
                });
            }

        };

        xhr.open("GET", "/getdata/${name}");
        xhr.send(null);

    }

    window.addEventListener("load", init, true);


</script>
<jsp:include page="../shared/footer.jsp" />