describe("HANOI!!!", function() {
    it("It gives moves to solve a one ring tower of hanoi", function() {
		expect(hanoi(1,3,2,1)).toBe("13,");
	});
	
	it("It gives moves to solve two ring towers of hanoi", function() {
		expect(hanoi(1,3,2,2)).toBe("12,13,23,");
		expect(hanoi(3,1,2,2)).toBe("32,31,21,");
	});
});
