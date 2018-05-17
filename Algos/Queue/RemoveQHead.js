function SLL() {
	this.head = null;
}

function Node(val) {
	this.val = val;
	this.next = null;
}

function removeHead(list) {
	if (list.head !== null) {
		var temp = list.head;
		list.head = list.head.next;
		return temp;
	} else {
		return null;
	}
}

/* Queue
  Queue has tail and head, Queue is also know as firs
  Infirst Out, FIFO */

function SLQ() {
	this.tail = null;
	this.head = null;
}

function addQ(slq, val) {
	if (slq.head === null) {
		slq.head = new Node(val);
		slq.tail = slq.head;
	} else {
		slq.tail.next = new Node(val);
		slq.tail = slq.tail.next;
	}
	return slq;
}

function removeHead() {
	if (slq.head === null) {
		return 'empty list';
	} else {
		if (slq.head.next === null) {
			runner = slq.head; /* slq has onluy one node */
			slq.head = null;
			slq.tail = null;
			return runner;
		} else {
			runner = slq.head;
			slq.head = slq.head.next;
			return runner;
		}
	}
}