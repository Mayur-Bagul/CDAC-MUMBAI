function fetchData(url, callback) {
    setTimeout(() => {
        const errorOccurred = Math.random() < 0.5; 

        if (errorOccurred) {
            const errorMessage = `Error fetching data from ${url}`;
            callback(errorMessage, null); 
        } else {
            const response = `Response from ${url}`;
            callback(null, response); 
        }
    }, 2000); 
}

function processData(data, callback) {
    setTimeout(() => {
        const processedData = data.toUpperCase(); 
        callback(processedData); 
    }, 1000); 
}


fetchData("https://www.tennistv.com/", (error, response) => {
    if (error) {
        console.error(error); 
    } else {
        processData(response, (processedResult) => {
            console.log(`Processed Result: ${processedResult}`); 
        });
    }
});