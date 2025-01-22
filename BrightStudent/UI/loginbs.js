document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevent form submission

    const preferedEmail = "bsadmin@gmail.com"
    const preferedPassword = "Admin@123"

    const email = document.getElementById('email').value.trim();
    const password = document.getElementById('password').value.trim();
    const emailError = document.getElementById('emailError');
    const passwordError = document.getElementById('passwordError');

    // Regex for basic email validation
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Reset error messages
    emailError.style.display = 'none';
    passwordError.style.display = 'none';

    let isValid = true;

    if (!email || !emailRegex.test(email) || email != preferedEmail) {
      emailError.style.display = 'block';
      isValid = false;
    }

    if (!password || password != preferedPassword) {
      passwordError.style.display = 'block';
      isValid = false;
    }

    if (isValid) {
      window.location.href = "./dashboardbs.html"
    }
  });

  document.getElementById('forgotPassword').addEventListener('click', function() {
    alert('Forgot Password functionality to be implemented.');
  });

  document.getElementById('signup').addEventListener('click', function() {
    alert('Sign Up functionality to be implemented.');
  });