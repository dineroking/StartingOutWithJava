/**
 * Created by Ronny Rosabal.
 * Date:      2/11/17
 * Objective:
 */
"use strict";

/*Write a function called "computeCompoundInterest".
 
 Given a principal, an interest rate, a compounding frequency, and a time (in years), "computeCompoundInterest" returns the amount of compound interest generated.
 
 var output = computeCompoundInterest(1500, .043, 4, 6);
 console.log(output); // --> 438.8368221341061*/

function computeCompoundInterest( principal, interestRate, frequency, timeInYears ) {
  return principal * (Math.pow( 1 + interestRate / frequency, frequency * timeInYears ) ) - principal;
}

console.log( computeCompoundInterest( 1500, .043, 4, 6 ) );