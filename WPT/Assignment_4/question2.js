function processArray(array, callback) {
    array.forEach((element, index) => {
        callback(element, index);
    });
}

processArray([1, 2, 3, 4], (element, index) => {
    const result = element * 2;
    console.log(`Index ${index}: ${result}`);
});