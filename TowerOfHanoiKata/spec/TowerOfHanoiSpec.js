describe("HANOI!!!", function() {
    it("It gives moves to solve the tower of hanoi", function() {
		expect(hanoi(1,3,2,1)).toBe("1 to 3, ");
		expect(hanoi(1,3,2,2)).toBe("1 to 2, 1 to 3, 2 to 3, ");
		expect(hanoi(3,1,2,2)).toBe("3 to 2, 3 to 1, 2 to 1, ");
	});
});
