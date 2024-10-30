function fetchData(url, callback) {
    setTimeout(() => {
        const response = `Response from ${url}`;
        callback(response);
    }, 2000); 
}


fetchData("https://www.tennistv.com/", (response) => {
    console.log(response); 
});