function hanoi(from, to, using, rings){
	if(rings > 0){
		return hanoi(from, using, to, rings - 1) + from + " to " + to + ", " + hanoi(using, to, from, rings - 1)
	} else {
		return ""
	}
}