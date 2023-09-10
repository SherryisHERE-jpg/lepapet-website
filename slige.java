var i = 0;
var images = [];
var slideTime = 3000; // 3 seconds

images[0] = '/proj/S_19087365.jpg';
images[1] = '/proj/S_19087364.jpg';
images[2] = '/proj/S_19087362.jpg';

function changePicture() {
    document.body.style.backgroundImage = images[i];

    if (i < images.length - 1) {
        i++;
    } else {
        i = 0;
    }

    setTimeout("changePicture()", slideTime);
}

window.onload = changePicture;