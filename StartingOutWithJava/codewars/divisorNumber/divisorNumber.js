/**
 * Created by Ronny Rosabal.
 * Date:      7/12/17
 * Objective:
 */
"use strict";

/*
 Find the number of divisors of a positive integer n.
 
 Example:
 
 divisors 4  = 3 -- 1, 2, 4
 divisors 5  = 2 -- 1, 5
 divisors 12 = 6 -- 1, 2, 3, 4, 6, 12
 divisors 30 = 8 -- 1, 2, 3, 5, 6, 10, 15, 30
 */


function getDivisorCnt( number ) {
  return getDivisors( number ).length;
}

function getDivisors( number ) {
  
  let divisors = [];
  let topDivisor = number / 2;
  let positiveNumber = Math.abs( number );
  
  for( let divisor = 1; divisor <= topDivisor; divisor++ ) {
    if( positiveNumber % divisor === 0 ) {
      divisors.push( divisor );
      if( number < 0 ) {
        divisors.push( -divisor );
      }
    }
  }
  divisors.push( number );
  
  return divisors;
}


// ES6 SOLUTION