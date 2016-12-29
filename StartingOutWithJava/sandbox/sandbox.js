/**
 * Created by Ronny Rosabal.
 * Date:      12/27/16
 * Objective: JavaScript from general testing
 */

/**
 * Person creates a person object
 * @param first the first name of the person
 * @param last the last name of the person
 * @constructor
 */

var first = "Leslie";
var last = "Gushin";

function Person( first, last ){
  this.first = first;
  this.last = last;
}

var person1 = new Person( "Ronny", "Rosabal" );

console.log( "person1.last:", person1.last );
console.log( "typeof person1:", typeof person1 );
console.log( "person1.constructor:" , person1.constructor );
console.log( person1 instanceof person1.constructor );

var person2 = new Person( "Christian", "Rosabal" );
console.log( "global first and last:", first, last );
console.log( "person2 first and last:", person2.first, person2.last );