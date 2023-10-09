function defaultTask(cb){
    cb();
}

const sass = require('gulp-sass')(require('sass'));
const gulp = require('gulp');

function compilaSCSS() {
    return gulp.src('./node_modules/bootstrap/scss/*.scss')
      .pipe(sass().on('error', sass.logError))
      .pipe(gulp.dest('./dist/css'));
};


exports.compila = compilaSCSS;