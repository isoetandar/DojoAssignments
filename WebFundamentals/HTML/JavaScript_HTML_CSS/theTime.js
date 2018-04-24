var HOUR = 7;
var MIN =15;
var PERIOD ="PM";
var str1;
var str2;

if (MIN<30){
	str1="just after";
} else
{str1 ="almost"}

if (PERIOD !== "AM"){
	str2 = "the morning";
}else
{str2 =" the evening"}

console.log("It's "+ str1+" " + HOUR + " "+str2 );