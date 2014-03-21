function bowl(round){
	var points = 0;
	var index = 0;
	while(!pastEnd(index, round)){
		points += pointValue(index, round);
		index++;
	}
	return points;
}

function pointValue(index, round){
	if(round.charAt(index) === 'X'){
		if(round.charAt(index + 2) === '/'){
			return 20;
		} else {
			return 10 + valueOf(round.charAt(index + 1)) + valueOf(round.charAt(index + 2));
		}
	} else if(round.charAt(index) === '/') {
		return 10 + valueOf(round.charAt(index + 1)) - valueOf(round.charAt(index - 1));
	} else {
		return valueOf(round.charAt(index));
	}
}

function valueOf(chr){
	if(chr === 'X'){
		return 10;
	} else if(chr === '-'){
		return 0;
	} else {
		return parseInt(chr);
	}
}

function pastEnd(index, round){
	if(round.charAt(index - 1) === 'X'){
		return (index > round.length - 3);
	} else if(round.charAt(index - 1) === '/'){
		return (index > round.length - 2);
	} else {
		return (index > round.length - 1);
	}
}
