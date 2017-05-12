// Code (SUT)
var isLeapYear = function(year) {
	return (year%4 === 0 && year%100 !== 0);
}

// Tests
var assert = require('assert');

describe('Leap Year Kata', function(){
	it('should return true for year 4', function(){
		assert.equal(true, isLeapYear(4));
	});

	it('should return false for year 3', function(){
		assert.equal(false, isLeapYear(3));
	});

	it('should return false for year 100', function(){
		assert.equal(false, isLeapYear(100));
	});
});