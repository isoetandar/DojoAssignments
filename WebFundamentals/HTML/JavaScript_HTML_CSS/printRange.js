function printRange(x,y,z){
  var i;
	if (x!==undefined && y!==undefined && z!==undefined){
		for (i =x; i<y; i +=z){
			console.log ("Three arg function print out: " +i);
		}
		console.log("===============================");
	}

	if (x!==undefined && y!==undefined && z===undefined){
		for (i =x; i<y; i +=1){
			console.log ("Two arg function print out: " +i);
		}
		console.log("===============================");
	}
	if (x!==undefined && y===undefined && z===undefined){
		for (i =0; i<x; i +=1){
		  console.log ("One arg function print out: " +i);
		}
	}
}

printRange(2,10,2);

printRange(2,10);

printRange(10);