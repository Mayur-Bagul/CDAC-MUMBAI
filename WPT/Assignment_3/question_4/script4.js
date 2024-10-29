const link = document.getElementById('highlight-link');
const boldWords = document.querySelectorAll('#paragraph strong');

link.addEventListener('mouseover', function() {
    boldWords.forEach(function(word) {
        word.classList.add('highlight');
    });
});

link.addEventListener('mouseout', function() {
    boldWords.forEach(function(word) {
        word.classList.remove('highlight');
    });
});