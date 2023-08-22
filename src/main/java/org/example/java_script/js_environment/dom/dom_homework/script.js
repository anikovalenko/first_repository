console.log('-------------------------------------------------------------------------');
console.log('Task 1: Select single elements');

const elementById = document.getElementById("page_name");
console.log(elementById);

const ul = document.querySelector('ul');
console.log(ul);

const clazz = document.querySelector('.button');
console.log(clazz);

console.log('-------------------------------------------------------------------------');
console.log('Task 2: Modifying Single Elements');


const newHeading = elementById.innerHTML = 'Facebook';
console.log(newHeading);

const newColor = ul.style.backgroundColor = 'yellow';

//Task 2C: will complete after watching the reconding

console.log('-------------------------------------------------------------------------');
console.log('Task 3: Selecting Multiple Elements');

const li = document.getElementsByTagName('li');
console.log(li);

const elementsInClass = document.getElementsByClassName('paragraphs');
console.log(elementsInClass);

const elementsInClass2 = document.querySelectorAll('.paragraphs');
console.log(elementsInClass2);

console.log('-------------------------------------------------------------------------');
console.log('Task 4: Modifying Multiple Elements');

for(let element of li){
   element.style.color = 'red';
}


for(let element of elementsInClass){
    element.innerHTML = 'Welcome to Instagram';
}

//expected: to print 'Welcome to Instagram' 3 times
//actal: prints once

for(let element of elementsInClass2){
element.addEventListener('click', () => alert(element.innerHTML))
};
