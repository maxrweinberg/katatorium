describe("BOWLING!!!", function() {
    it("It calculates games of bowling", function() {
		expect(bowl("XXXXXXXXXXXX")).toBe(300);
		expect(bowl("9-9-9-9-9-9-9-9-9-9-")).toBe(90);
		expect(bowl("5/5/5/5/5/5/5/5/5/5/5")).toBe(150);
		expect(bowl("12121212121212121212")).toBe(30);
	});
});
