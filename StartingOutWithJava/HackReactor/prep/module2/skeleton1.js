/**
 * Created by Ronny Rosabal.
 * Date:      4/10/17
 * Objective:
 */
"use strict";
/*
 Convert from a flat class list of names to an object literal decorated with an age for each student.
 
 The ages should be randomly generated for each student, either age 10 or age 11.
 
 Example
 
 var classList = ["Joe", "Jack", "John", "Fred", "Frank", "Barry", "Larry", "Mary",
 "Harry", "Farrell", "Susan", "Monica", "Keira", "Caroline", "Harriet", "Erica",
 "Luann", "Cheryl", "Beth", "Rupa", "Linda", "Allison", "Nancy", "Dora"];
 
 var classListWithAges = [{"name":"Joe","age":11},{"name":"Jack","age":10},
 {"name":"John","age":11},{"name":"Fred","age":11},{"name":"Frank","age":11},
 {"name":"Barry","age":11},{"name":"Larry","age":11},{"name":"Mary","age":11},
 {"name":"Harry","age":11},{"name":"Farrell","age":10},{"name":"Susan","age":10},
 {"name":"Monica","age":11},{"name":"Keira","age":10},{"name":"Caroline","age":10},
 {"name":"Harriet","age":11},{"name":"Erica","age":11},{"name":"Luann","age":10},
 {"name":"Cheryl","age":11},{"name":"Beth","age":10},{"name":"Rupa","age":11},
 {"name":"Linda","age":10},{"name":"Allison","age":10},{"name":"Nancy","age":10},
 {"name":"Dora","age":10}]
 
 Hint for testing: Given that the age for each student is random upon each run, we suggest that your tests check for age values of EITHER 10 or 11.*/

// See https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Math/random

function getRandomIntInclusive( min, max ) {
  min = Math.ceil( min );
  max = Math.floor( max );
  return Math.floor( Math.random() * (max - min + 1) ) + min;
}

function decorateClassListWithAges( classList ) {
  // your code here
  return classList.map( function( name, index, array ) {
    return { "name" : name, "age" : getRandomIntInclusive( 10, 11 ) };
  } );
}

var classList = ["Joe", "Jack", "John", "Fred", "Frank", "Barry", "Larry", "Mary",
                 "Harry", "Farrell", "Susan", "Monica", "Keira", "Caroline", "Harriet", "Erica",
                 "Luann", "Cheryl", "Beth", "Rupa", "Linda", "Allison", "Nancy", "Dora"];

console.log( decorateClassListWithAges( classList ) );