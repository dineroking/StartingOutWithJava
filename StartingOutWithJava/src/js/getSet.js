/**
 * Created by Ronny Rosabal.
 * Date:      12/23/16
 * Objective:
 */
var person = {
  _name : "Ronny",
  get name() {
    console.log( "getter was called" );
    return this._name;
  },
  
  set name( value ) {
    console.log( "setter was called" );
    this._name = value;
  }
};

// calls the getter property
console.log( person.name );

// calls the setter property
person.name = "Leslie";

// calls the getter property
console.log( person.name );
