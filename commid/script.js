/**
 * Handle Login Transition
 */
function handleLogin() {
    const loginView = document.getElementById('login-view');
    const dashView = document.getElementById('dashboard-view');

    // Simple scale-out effect
    loginView.style.opacity = '0';
    loginView.style.transform = 'scale(0.9)';

    setTimeout(() => {
        loginView.classList.remove('active');
        dashView.classList.add('active');
    }, 500);
}

/**
 * Handle Logout
 */
function handleLogout() {
    location.reload(); // Quick reset
}

/**
 * Navigation within Dashboard
 */
function showSection(sectionId, btnElement) {
    // Hide all sections
    const sections = document.querySelectorAll('.section');
    sections.forEach(sec => sec.classList.remove('active'));

    // Deactivate all nav buttons
    const navItems = document.querySelectorAll('.nav-item');
    navItems.forEach(item => item.classList.remove('active'));

    // Show target section and active button
    document.getElementById(sectionId).classList.add('active');
    btnElement.classList.add('active');

    // Logic feedback for debug
    console.log("System: Navigated to " + sectionId);
}

// Add Enter-key support for Login
document.addEventListener('keypress', (e) => {
    if (e.key === 'Enter') {
        const loginPage = document.getElementById('login-view');
        if (loginPage.classList.contains('active')) {
            handleLogin();
        }
    }
});