function defaultTask(cb){
    cb();
}

const sass = require('gulp-sass')(require('sass'));
const gulp = require('gulp');

function compilaSCSS() {
    return gulp.src('./scss_styles/*.scss')
      .pipe(sass().on('error', sass.logError))
      .pipe(gulp.dest('./dist/css'));
};


exports.compila = compilaSCSS;