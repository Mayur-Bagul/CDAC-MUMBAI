document.getElementById('remove-button').addEventListener('click', function() {
    const dropdown = document.getElementById('dropdown');
    const selectedIndex = dropdown.selectedIndex;
    const messageDiv = document.getElementById('message');

    if (selectedIndex !== -1) {
        const removedItem = dropdown.options[selectedIndex].text;
        dropdown.remove(selectedIndex); // Remove the selected item
        messageDiv.textContent = `${removedItem} has been removed. `;
    } else {
        messageDiv.textContent = 'Please select an item to remove.';
    }
});