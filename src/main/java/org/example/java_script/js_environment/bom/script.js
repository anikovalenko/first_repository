
// *************  BOM - Browser Object Model  *****************


//----------------------------------------------------------------------------------------------------------------------

//Navigator Object
//Provides an information regarding working platform (browser, OS...)
const userAgent = navigator.userAgent;

console.log(userAgent);

if(userAgent.includes('Chrome')){
console.log('you are using Chrome browser') 
}

const platform = navigator.platform;

console.log(platform);


//----------------------------------------------------------------------------------------------------------------------

//Location Object
//shows current location as an absolute path, makes possible to make redirections and some other manipulations

 console.log(location.href);
// location.href = 'https://google.com';



//----------------------------------------------------------------------------------------------------------------------

//History Object
//Provides an opportunity to make some navigations within the history

history.back;
history.forward;

//----------------------------------------------------------------------------------------------------------------------


//The pop-ups on the screen, are not provided by main JS package. These are the browser's feature.
//They are not used in real projects due to the absence of ability to induce any style changes.
alert(1);

const booleanChoice = confirm('Are you sure you want to submit the registration ?');
console.log('booleanCoice: ' + booleanChoice);

const answer = prompt('Your Name');
console.log('Hi ' + answer);
/*
return null: case -> cancel
return "": case -> empty string
return value: case -> input value
*/
//----------------------------------------------------------------------------------------------------------------------