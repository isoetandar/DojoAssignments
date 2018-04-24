var dayReward=0.01;
var totalReward=0;
for(var i=1;i<=1030;i++){
	dayReward = (2**(i-1))*0.01;
	totalReward += dayReward;

	// console.log("Day in count: " +i);
	// console.log("dayReward is: "+ dayReward );
	// console.log("totalReward is: "+ totalReward );
	// console.log("====================") ;

	if (totalReward > 10000 && totalReward < 20000){
		console.log( "Day reaching more than $10000 but less $20000: " +i);}

	if (totalReward > 1000000 && totalReward < 2000000){
		console.log( "Day reaching more than $1000000 but less $2000000: " +i);}
		
	if (totalReward >Number.MAX_VALUE){
		console.log( "Day reaching Infinity: " + (i-1));}
	
}