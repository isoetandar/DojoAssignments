// RandomChange();
function RandomChange(x){
	
	while (x>0){ 
		var randNumber = Math.floor(Math.random()*100);
		// var randNumber = 37; //test case
		if (randNumber===37){
		  console.log("you're winning!!");
		  console.log("Winning number is :" + randNumber);
		  winningQuater = Math.floor(Math.random()*100);
		  console.log("Your winning Quaters are: "+ winningQuater);
		  x += winningQuater;
		  console.log("Your total Quaters are: " + x);
		  break;
		}
		else {console.log("you lost!!");
		  console.log("Winning number is :" + randNumber);
		  x--;
		  if (x===0){
		  	console.log("All your inserted Quaters were wasted");
		  	break;
		  }
		}
	}
}

RandomChange(100);