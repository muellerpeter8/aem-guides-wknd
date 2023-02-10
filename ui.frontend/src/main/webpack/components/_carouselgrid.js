(function() {
    "use strict";
    const carouselGridCon = document.querySelector('.carouselgrid-con');
    const slideParent = document.querySelector('.slides-container');
    const next = document.querySelector('.next');
    const prev = document.querySelector('.prev');
    const slides = document.querySelectorAll('.mySlides');
    const dotsCon = document.querySelector('.pagination-con');
    const dots = document.querySelectorAll('.dot');
    let columnsNumber = carouselGridCon.dataset.columns;
    setFirstTwoSlides();
    const slide1 = document.querySelector('.slide1');
    const slide2 = document.querySelector('.slide2');
    let slideIndex = 1;
    slideParent.className += ' columns' + columnsNumber;
    
    if (carouselGridCon.classList.contains('carousel-con')) {
        // makeDots();
        showSlides(slideIndex);
    }

    function makeDots() {
        let i;
        for (i = 1; i < slides.length; i++) {
            var newDot = '<button class="dot" data-slide-number="' + i + '"></button>';
            dotsCon.innerHTML += newDot;
        }
    }

    // Next/previous controls
    function plusSlides(n) {
        showSlides(slideIndex += n);
    }

    // Pagination controls
    function currentSlide(n) {
        showSlides(slideIndex = n);
    }

    function setFirstTwoSlides() {
        slides[0].className += " slide1";
        slides[1].className += " slide2";
    }

    function showSlides(n) {
        let i;
        slideParent.prepend(slide2);
        slideParent.prepend(slide1);
        if (n > slides.length) {slideIndex = 1}
        if (n < 1) {slideIndex = slides.length}
        for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
        }
        for (i = 0; i < dots.length; i++) {
            dots[i].className = dots[i].className.replace(" active", "");
        }
        dots[slideIndex-1].className += " active";
        slides[slideIndex-1].style.display = "block";
        if (columnsNumber == 3 && screen.width >= 768) {
            if (slideIndex >= slides.length - 1) {
                slide1.style.display = "block";
                slideParent.append(slide1);
            } else {
                slides[slideIndex+1].style.display = "block";
            }
            if (slideIndex == (slides.length)) {
                slide2.style.display = "block";
                slideParent.append(slide2);
            } else {
                slides[slideIndex].style.display = "block";
            }
        }
        if (columnsNumber == 2 && screen.width >= 768) {
            if (slideIndex == (slides.length)) {
                slide1.style.display = "block";
                slideParent.append(slide1);
            } else {
                slides[slideIndex].style.display = "block";
            }
        }
    }

    next.addEventListener('click', e => plusSlides(1));
    prev.addEventListener('click', e => plusSlides(-1));

    dots.forEach(dot => 
        dot.addEventListener('click', e => {
            let dotNumber = parseInt(dot.dataset.slideNumber)
            currentSlide(dotNumber)
        })
    );
}());