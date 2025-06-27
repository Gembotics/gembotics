
const validPaths = [
    "/", 
    "/index.html", 
    "/pages/under-construction.html", 
    "/pages/contact.html", 
    "/pages/about-us.html", 
    "/pages/terms-conditions.html", 
    "/pages/privacy-policy.html"
  ];
  
  // Get current path
  const currentPath = window.location.pathname;
  
  // If the current path is not in the valid list, redirect to under-construction
  if (!validPaths.includes(currentPath)) {
    window.location.href = "/pages/under-construction.html";
  }

console.log('cuurentPath: ',currentPath);

// if (!validPaths.includes(currentPath)) {
//     window.location.href = "/pages/under-construction.html";
// }


// if (!validPaths.includes(currentPath)) {
//     window.location.href = "/index.html"; // or "/"
// }

// if (window.location.pathname === contact || careers || ourServices || aboutUs ) {
//     window.location.href = "/pages/under-construction.html";
// }

// if (window.location.pathname != "/index1.html" || "/pages/contact.html" || "/pages/terms-conditions.html" || "/pages/privacy-policy.html" ) {
//     window.location.href = "/pages/under-construction.html";
// }
// if (window.location.pathname === "/pages/contact/" ) {
//     window.location.href = "/pages/contact.html";
// }
// if (window.location.pathname === "/pages/about/" ) {
//     window.location.href = "/pages/about.html";
// }
// if (window.location.pathname === "/pages/terms-conditions/" ) {
//     window.location.href = "/pages/terms-conditions.html";
// }
// if (window.location.pathname === "/pages/privacy-policy/" ) {
//     window.location.href = "/pages/privacy-policy.html";
// }