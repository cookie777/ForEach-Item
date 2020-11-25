

const accentColor = "#5BBE0D"
const secondaryColor = "#242920"

const title1 = ["Have you ever felt any frustration", "about the \"lb\" unit", "when you are buying something?"];
const title2 = ["Do you want to know how much", "it costs if you buy one piece of food?", "For example, a price for one piece of apple"];
const title3 = ["When you buy some fruits or vegetables,","do you use a scale?"];

const data1 = [1,6,1,2];
const data2 = [4,5,0,1];
const data3 = [6,1,2,0];

const label1 = [
                    "Yes, a lot !",
                    "Yes, sometimes",
                    "Not actually",
                    "Not at all"
                ]

const label2 = [
                    "Yes, many times!",
                    "Yes, sometimes",
                    "Not actually",
                    "Not at all"
                ]

const label3 = [
                    "Yes, always",
                    "Yes, sometimes",
                    "Not so many",
                    "Not at all"
                ]

var c1 = createChart('chart1', title1, data1, label1);
var c2 = createChart('chart2', title2, data2, label2);
var c3 = createChart('chart3', title3, data3, label3);

function createChart(name, title, dataArr,label){

    var ctx = document.getElementById(name).getContext('2d');
    var chart = new Chart(ctx, {
        type: 'pie',
        data: {
            datasets: [{
                data: dataArr,
                backgroundColor: [
                    accentColor,
                    accentColor+'99',
                    secondaryColor+'55',
                    secondaryColor+'11'
                ]
            }],
            labels: label
        },
        options: {
            responsive: true,
            maintainAspectRatio: false,
            title: {
                display: false,// decide no to use
                text: title
            }
        }
    });

    return chart;
}






