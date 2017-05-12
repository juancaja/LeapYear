// Code (SUT)
var isLeapYear = function(year) {
	return year%4 === 0;
}

// Tests
var assert = require('assert');

describe('Leap Year Kata', function(){
	it('should return true for year 4', function(){
		assert.equal(true, isLeapYear(4));
	});
});