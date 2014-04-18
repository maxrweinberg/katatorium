function hanoi(from, to, using, rings){
	if(rings === 0){
		return "";
	} else {
		return hanoi(from, using, to, rings - 1) + from + to + "," + hanoi(using, to, from, rings - 1);
	}
}

function iterativeHanoi(from, to, using, rings){
	var stack = [
		[from, to, using, rings, false]
	];
	var str = "";
	
	while(stack.length > 0){
		var current = stack.pop();
		if(current[4] === true){
			str += current[0] + '' + current[1] + ',';
		} else if(current[3] > 0){
			stack.push([current[2],current[1],current[0],current[3]-1,false]);
			stack.push([current[0],current[1],current[2],current[3],true]);
			stack.push([current[0],current[2],current[1],current[3]-1,false]);
		}
	}
	
	return str;
}