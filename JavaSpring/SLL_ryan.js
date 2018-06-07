function SLList(){
    this.head = null;
}

function Node(val){
	this.val = val;
	this.next = null;
}

function add(val, slist){
	if (slist.head === null){
		slist.head = new Node(val);
		return slist;
	}

	runner = slist.head;
	while (runner.next){
		runner = runner.next;
	}
	runner.next = new Node(val);
}


function reverse(slist){
	if (slist.head === null){
		return slist;
	}
  else if (slist.head.next === null){
    return slist;
  }

  var reversed = new SLList;
  var runner = slist.head;
  var nodes_to_add = 1;

  while (runner.next){
    runner = runner.next;
    nodes_to_add++;
  }
  //add(runner.val, reversed);
  //nodes_to_add--;

  while (nodes_to_add > 0){
    runner = slist.head;
      for(var i = 0; i < nodes_to_add-1; i++){
        runner = runner.next;
      }
    add(runner.val, reversed);
    nodes_to_add--;
  }
  return reversed;
}

function kth_last(slist, k){
  if (slist.head === null){
    return;
  }
  else if (k <=0){
    return;
  }
  var count = 1;
  var runner = slist.head;
  while (runner.next){
    count++;
    runner = runner.next;
  }
  if (k > count){
    return;
  }

  runner = slist.head;
  for (var i = 0; i < count-k; i++){
    runner = runner.next;
  }
  return runner;

}

var mylist = new SLList;
add(1, mylist);
add(2, mylist);
add(3, mylist);

console.log(mylist);
console.log(mylist.head.next);
var runner = mylist.head;

while (runner.next){
  console.log(runner);
  runner = runner.next;
}
var reversed = reverse(mylist);
console.log(reversed);
console.log(reversed.head.next);
var runner2 = reversed.head;

console.log ("***********************");
while (runner2.next){
  console.log("Current node value:", runner2.val, "Current node next:", runner2.next);
  runner2 = runner2.next;
}


function remove(slist){
	if (slist.head === null){
		return;
	}
	else if (slist.head.next === null){
		runner = slist.head;
		slist.head = null;
		return runner;
	}
	runner = slist.head;
  while (runner.next.next){
    runner = runner.next;
  }
  var dnw = runner.next;
  runner.next = null;
	return dnw;
}
function isPalindrome(slist){
  if (slist.head === null){
    console.log("head is null");
    return false;
  }

  else if (slist.head.next == null){
    return true;
  }
  while (slist.head.next){
    var headval = slist.head.val;
    var lastval = remove(slist).val;
      console.log(headval);
      console.log(lastval);
    if (headval == lastval){
      slist.head = slist.head.next;
    }
    else{
      console.log(headval);
      console.log(lastval);
      return false;
    }
  }
  return true;

}

function isPalindromeKeepOriginal(slist){
  var reversed = reverse(slist);

  runner1 = slist.head;
  runner2 = reversed.head;

  while(runner1 && runner2){
    if (runner1.val == runner2.val){
      runner1 = runner1.next;
      runner2 = runner2.next;
    }
    else{
      return false;
    }
  }
  if (!runner1 && !runner2){
    return true;
  }
  return false;
}

add(4, mylist);
add(5, mylist);
add(4, mylist);
add(3, mylist);
add(2, mylist);
add(1, mylist);
console.log(kth_last(mylist, 3))
console.log(kth_last(mylist, 5))
console.log(kth_last(mylist, 1))
console.log(mylist);
console.log(isPalindromeKeepOriginal(mylist));
console.log(mylist);
add(2, mylist);
console.log(isPalindromeKeepOriginal(mylist));