// Code (SUT)
var isLeapYear = function(year) {
	return false;
}

// Tests
var assert = require('assert');

describe('Leap Year Kata', function(){
	it('should return true for year 4', function(){
		assert.equal(true, isLeapYear(4));
	});
/*
	it('should return 2 when 2', function(){
		assert.equal(2, fizzbuzz(2));
	});
	it('should return Fizz when 3', function(){
		assert.equal(fizzbuzz(3), 'Fizz');
	});
	it('should return Buzz when 5', function(){
		assert.equal(fizzbuzz(5), 'Buzz');
	});
	it('should return FizzBuzz when 15', function(){
		assert.equal(fizzbuzz(15), 'FizzBuzz');
	});
*/
});