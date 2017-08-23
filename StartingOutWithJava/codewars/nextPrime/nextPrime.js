/**
 * Created by Ronny Rosabal.
 * Date:      7/12/17
 * Objective:
 */
"use strict";

/*
 It's really simple:
 
 Get the next prime number!
 
 You will get a number n (n>=0) and your task is to find the next prime number.
 
 e.g: nextPrime(5)=>7 || nextPrime(12)=>13
 
 Make sure to optimize your code. There will be huge numbers in the tests!*/

function nextPrime( number ) {
  
  let result;
  
  if( number < 0 ) {
    result = "not a valid entry"
  } else {
    while( !isPrime( number + 1 ) ) {
      number++;
    }
    result = number + 1;
  }
  
  return result;
}

function isPrime( number ) {
  
  let isPrime = true;
  if( number <= 1 ) {
    isPrime = false;
  } else if( number > 2 ) {
    for( let i = 2; i <= ( number / 2 ); i++ ) {
      if( number % i === 0 ) {
        isPrime = false;
        break;
      }
    }
  }
  
  return isPrime;
}

function nextPrime( number ) {
  
  let primeFound = false;
  let rootOfNumber;
  
  if( number === 0 || number === 1 ) {
    return 2;
  }
  
  if( number % 2 === 0 ) {
    number++;
  } else {
    number += 2;
  }
  
  while( !primeFound ) {
    
    rootOfNumber = Math.sqrt( number );
    primeFound = true;
    for( let i = 3; i <= rootOfNumber; i+=2 ) {
      console.log( number );
      if( number % i === 0 ) {
        number += 2;
        primeFound = false;
        break;
      }
    }
    
  }
  
  return number;
}
