document.getElementById('style-button').addEventListener('click', function() {
    const paragraph = document.getElementById('sample-paragraph');
    paragraph.style.color = 'yellow'; // Change text color
    paragraph.style.fontSize = '20px'; // Change font size
    paragraph.style.fontWeight = 'bold'; // Make text bold
});

document.getElementById('bg-button').addEventListener('click', function() {
    const body = document.body;
    body.style.backgroundColor = '#4A90E2'; // Change background color
    body.style.backgroundImage = url("e:\WPT\Assignment_3\sporty-excitement-green-grass-court-outdoors-generative-ai.jpg"); // Change background image
});