<#include "base.ftlh">

<#macro page_body>

    <br>
    <h1 class="text-center">Graphs</h1>
    <br>

    <div class="row">
        <div class="col-md-6">
            <div id="piechart1"></div>
        </div>
        <div class="col-md-6">
            <div id="piechart2"></div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div id="piechart3"></div>
        </div>
    </div>

    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
        // Load google charts
        google.charts.load('current', {'packages':['corechart']});
        google.charts.setOnLoadCallback(drawChart);

        // Draw the chart and set the chart values
        function drawChart() {
            var data1 = google.visualization.arrayToDataTable([
                ['ValueName', 'Value'],
                ['1', ${question1[0]}],
                ['2', ${question1[1]}],
                ['3', ${question1[2]}],
                ['4', ${question1[3]}],
                ['5', ${question1[4]}]
            ]);

            // Optional; add a title and set the width and height of the chart
            var options1 = {'title':'Question 1: ${poll.getquestion1()}', 'width':550, 'height':400};

            // Display the chart inside the <div> element with id="piechart"
            var chart1 = new google.visualization.PieChart(document.getElementById('piechart1'));

            var data2 = google.visualization.arrayToDataTable([
                ['ValueName', 'Value'],
                ['1', ${question2[0]}],
                ['2', ${question2[1]}],
                ['3', ${question2[2]}],
                ['4', ${question2[3]}],
                ['5', ${question2[4]}]
            ]);

            // Optional; add a title and set the width and height of the chart
            var options2 = {'title':'Question 2: ${poll.getquestion2()}', 'width':550, 'height':400};

            // Display the chart inside the <div> element with id="piechart"
            var chart2 = new google.visualization.PieChart(document.getElementById('piechart2'));

            var data3 = google.visualization.arrayToDataTable([
                ['ValueName', 'Value'],
                ['1', ${question3[0]}],
                ['2', ${question3[1]}],
                ['3', ${question3[2]}],
                ['4', ${question3[3]}],
                ['5', ${question3[4]}]
            ]);

            // Optional; add a title and set the width and height of the chart
            var options3 = {'title':'Question 3: ${poll.getquestion3()}', 'width':550, 'height':400};

            // Display the chart inside the <div> element with id="piechart"
            var chart3 = new google.visualization.PieChart(document.getElementById('piechart3'));

            chart1.draw(data1, options1);
            chart2.draw(data2, options2);
            chart3.draw(data3, options3);
        }
    </script>

</#macro>

<@display_page/>