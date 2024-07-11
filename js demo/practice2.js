let students = [
    {'name' : 'john', 'dept' : 'cse' , 'gender' : 'Male', 'mark' : 90},
    {'name' : 'jasmine', 'dept' : 'cse' , 'gender' : 'Female', 'mark' : 77},
    {'name' : 'clara', 'dept' : 'cse' , 'gender' : 'Female', 'mark' : 72}
];

// Task 1: Sort by marks
students.sort((a, b) => a.mark - b.mark);
console.log("Students sorted by marks:", students);

// Task 2: Find female students
let femaleStudents = students.filter(student => student.gender === 'Female');
console.log("Female students:", femaleStudents);

// Task 3: Find students who scored greater than 75
let highScorers = students.filter(student => student.mark > 75);
console.log("Students who scored greater than 75:", highScorers);

// Task 4: Find students whose name starts with 'j'
let studentsWithNameJ = students.filter(student => student.name.charAt(0).toLowerCase() === 'j');
console.log("Students whose name starts with 'j':", studentsWithNameJ);
