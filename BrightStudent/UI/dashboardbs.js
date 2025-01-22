const sideMenu = document.getElementById('sideMenu');
const mainContent = document.getElementById('mainContent');
const toggleBtn = document.getElementById('toggleBtn');

toggleBtn.addEventListener('click', () => {
    sideMenu.classList.toggle('collapsed');
    mainContent.classList.toggle('collapsed');
});


document.getElementById('logout').addEventListener('click', () => {
    window.location.href = './loginbs.html';
})