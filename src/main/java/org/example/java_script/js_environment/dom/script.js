// *************  DOM - Document Object Model  *****************

// .html file structure representation in JS
// Document Object

const htmlElement = document.documentElement;
console.log(htmlElement);

const head = document.head;
console.log(head);

const body = document.body;
console.log(body);
//NOTE: check why returns null

const childHead = head.childNodes;
console.log(childHead);
//text printed in console means <br>
//childNodes method return collection. the map(), every(), some()... methods doesn't work with collections. 
//Use the 'for of' or.forEach().

// const childBody = body.childNodes;
// console.log(childBody);

const hasChilds = head.hasChildNodes();
console.log('the head has child nodes: '+ hasChilds);

//NOTE: check first and last childs
const firstChild = head.firstChild;
console.log('first child of Head: ');
console.log(firstChild);

const lastChild = head.lastChild;
console.log('last child of Head: ');
console.log(lastChild);

//NOTE: check the real first element
//should return the first element which is not a comment or <br>
const realFirstElement = head.firstElementChild;
console.log('first real child of Head: ');
console.log(realFirstElement);

//returns null due to the body defines as null
const nextSiblingNode = head.nextSibling;
console.log('heads next sibling: ');
console.log(nextSiblingNode);

const parent = head.parentNode;
console.log('heads parent: ');
console.log(parent);


//document.querySelectorAll() does not return an alive collection
//document.getElementByClassName() returns an alive collection

//alive methods don't make a deep copy and the returned collection
//may be changed in the case of changing the initial tag list

const eventOnElement = document.querySelector('.square');

eventOnElement.addEventListener('mouseenter', function(){
    eventOnElement.style.backgroundColor = 'green';
});

eventOnElement.addEventListener('mouseleave', function(){
    eventOnElement.style.backgroundColor = 'black';
});

const changedContext = document.querySelector('h1').innerHTML = 'Poghosuhi';
//const changedContext2 = document.querySelector('h1').textContent = 'Petrosuhi';

// .textContent is more secure when trying to get some value from the user.
// The text takes as a string and do not mix with the html file in case of entering an html element.

let newElement = document.createElement('div');
console.log('created element by JS:');
console.log(newElement); 


const newElWrapper = document.querySelector('.new_element_wrapper');
newElWrapper.insertAdjacentHTML(
    'afterbegin',
    '<p>new text assigned</p>'
);

const ulWrapper = document.querySelector('#ul_wrapper');
const outsideLi = document.querySelector('#li_in_outside');

// ulWrapper.append(outsideLi);

// append - add to end
// prepend - add the begining

//to copy instead of move:
const liClone = outsideLi.cloneNode(true);
ulWrapper.append(liClone);

const elementToDelete = document.querySelector('.p_to_delete');
elementToDelete.remove();

//input task
//Take the input value and add it to list

const append = document.querySelector('.append');

append.addEventListener('click', ()=>{
    const input = document.getElementById('input_field');
    let value = input.value;
    const li = document.createElement('li');
    li.innerHTML = value;
    const inputStorage = document.querySelector('.input_values');
    // inputStorage.insertAdjacentHTML('afterbegin',  value);
    inputStorage.append(li);
    input.value='';
});

const prepenrd = document.querySelector('.prepend');

prepenrd.addEventListener('click', ()=>{
    const input = document.getElementById('input_field');
    let value = input.value;
    const li = document.createElement('li');
    li.innerHTML = value;
    const inputStorage = document.querySelector('.input_values');
    // inputStorage.insertAdjacentHTML('afterbegin',  value);
    inputStorage.prepend(li);
    input.value='';
});