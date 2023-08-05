let user1={
	name: 'John',
	age: 25
}

let user2 = createNewUser(user1);
console.log(user1);
console.log(user2);

function createNewUser(user1){
let user2 = Object.assign(user1);
user2.name = 'Thomas';
user2.age = 30;
return user2;
}

