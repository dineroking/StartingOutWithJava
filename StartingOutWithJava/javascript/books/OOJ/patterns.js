/**
 * Created by Ronny Rosabal.
 * Date:      4/3/17
 * Objective:
 */
"use strict";

// an example of closure
var person = ( function() {
  var age = 0;
  return {
    "name" : "Christian",
    "getAge" : function() {
      return age;
    }
  }
}() );

// example of scope-safe constructor

var name = "ronny";

function Person( name ) {
  if( this instanceof Person ) {
    this.name = name;
  } else {
    return new Person( name );
  }
}

var person1 = new Person( "Christian" );
var person2 = Person( "Leslie" );

console.log( "global name: ", name );
console.log( "person1:", person1.name );
console.log( "person2:", person2.name );