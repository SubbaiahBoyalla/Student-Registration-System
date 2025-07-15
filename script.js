document.addEventListener("DOMContentLoaded", () => {
    const phoneInput = document.querySelector("input[name='phone']");
    phoneInput.addEventListener("input", () => {
        phoneInput.value = phoneInput.value.replace(/[^0-9]/g, "");
    });
});
