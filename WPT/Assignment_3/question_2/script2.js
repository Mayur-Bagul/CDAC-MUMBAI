document.getElementById('contact-form').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    // Get values from the form
    const firstName = document.getElementById('first-name').value;
    const lastName = document.getElementById('last-name').value;
    const contactNumber = document.getElementById('contact-number').value;
    const email = document.getElementById('email').value;

    // Display values on the page
    const output = document.getElementById('output');
    output.innerHTML = `
        <h2>Submitted Information:</h2>
        <p>First Name: ${firstName}</p>
        <p>Last Name: ${lastName}</p>
        <p>Contact Number: ${contactNumber}</p>
        <p>Email ID: ${email}</p>
    `;
});