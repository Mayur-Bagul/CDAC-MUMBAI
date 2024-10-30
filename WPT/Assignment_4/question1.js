function toUpperCase(str) {
    return str.toUpperCase();
}

function processData(inputString, callback) {
    return callback(inputString);
}

const result = processData("hello world", toUpperCase);
console.log(result); 
