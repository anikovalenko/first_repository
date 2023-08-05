let duplicatedArray = duplicateElements([1,2,3,4]);
console.log(duplicatedArray);

let positiveNums = collectPositiveNumbers([4,-50,10,154,200,200]);
console.log(positiveNums);

let containsEvenNums = checkEvens([1,2,3,4,5,6,7,8,9]);
console.log(containsEvenNums);

let user1 = {
    name: 'Alice'
}

let user2 = {
    name: 'Bob'
}

let user3 = {
    name: 'Charlie'
}

let arrayOfNames = convert([user1, user2, user3])
console.log(arrayOfNames);

let object_1 = {
    name: 'Alice',
    age: 25,
   };

let object_2 = {
    city: 'New York',
    occupation: 'Engineer',
    };

   
console.log('Merging via 2nd version ');
console.log(combineObjectsV1(object_1, object_2));

console.log('Merging via 2nd version ');
console.log(combineObjectsV2(object_1, object_2));




function duplicateElements(array){
return array.map(a => a*2);
}

function collectPositiveNumbers(array){
return array.filter(a=> a>0);
}

function checkEvens(array){
return array.every(a => a%2  === 0);
}

function convert(arrayOfObjects){
return arrayOfObjects.map((a) => a.name);
}

function combineObjectsV1(object_1, object_2){
return Object.assign(object_1, object_2);
}

function combineObjectsV2(object_1, object_2){
    let newObject = {
        ...object_1,
        ...object_2
    }
return newObject;
}
