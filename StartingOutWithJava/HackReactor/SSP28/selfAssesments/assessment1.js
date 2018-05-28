/**
 * Created by Ronny Rosabal.
 * Date:      5/24/2018
 * Objective: HackReactor self assessment 1
 */
'use strict';

// SELF ASSESSMENT 1

let getFirstAndLast = function( arr ) {
  return 'First: ' + arr[0] + ', Last: ' + arr[arr.length - 1];
};

let getEveryOtherNumber = function( start, end ) {
  let alternatingNumbers = [];
  for( start; start < end; start += 2 ) {
    alternatingNumbers.push( start );
  }
  return alternatingNumbers;
};

/*console.log( getEveryOtherNumber( 0,10 ) );
console.log( getEveryOtherNumber( 4,8 ) );
console.log( getEveryOtherNumber( 11,16 ) );
console.log( getEveryOtherNumber( 21,29 ) );
console.log( getEveryOtherNumber( 10,1 ) );
console.log( getEveryOtherNumber( 5,5 ) );*/

let personInfo = function( info ) {
  let message = '';
  message += info.name.first + ' ' + info.name.last + ' | ';
  if( info.hasOwnProperty( 'company' ) ) {
    message += info.company;
  } else {
    message += 'N/A';
  }
  return message;
};

var person = {
  name    : {
    first : 'Kyla',
    last  : 'Richardson'
  },
  company : 'Accenture PLC'
};

var personB = {
  name : {
    first : 'Anna',
    last  : 'Little'
  }
};

/*
console.log( personInfo( person ) );
console.log( personInfo( personB ) );*/



let personAndSelectedInfo = function( person, prop ) {
  let message = '';
  message += person.name.first + ' ' + person.name.last + ' | ';
  if( person.hasOwnProperty( prop ) ) {
    message += person[prop];
  } else {
    message += 'N/A';
  }
  return message;
};

var people = [
  { name    : {
      first : 'Jackson',
      last  : 'Holtzman'
    },
    salary  : '$64,000',
    company : 'NASA',
    age     : 29
  },
  { name     : {
      first : 'Isabel',
      last  : 'Porter'
    },
    salary   : '$72,000',
    company  : 'esurance',
    commutes : true
  },
  { name          : {
      first : 'Lisa',
      last  : 'Tipton'
    },
    salary        : '$59,000',
    company       : 'Sony',
    yearsEmployed : 1
  },
  { name          : {
      first : 'Lillian',
      last  : 'Grossman'
    },
    salary        : '$105,000',
    company       : 'eBay',
    yearsEmployed : 2
  }
];

/*
console.log( personAndSelectedInfo( people[0], 'company' ) );
console.log( personAndSelectedInfo( people[0], 'age' ) );
console.log( personAndSelectedInfo( people[3], 'age' ) );
console.log( personAndSelectedInfo( people[1], 'commutes' ) );*/


let displayPeopleSelectedInfo = function( people, prop ) {
  let message = '';
  people.forEach( function( person ){
    message += personAndSelectedInfo( person, prop ) + '\n';
  } );
  return message;
};

/*
console.log( displayPeopleSelectedInfo(people, "yearsEmployed") );*/