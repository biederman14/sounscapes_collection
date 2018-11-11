function listAlbums(jsonArray){
	const albums = document.createElement('albums');
	jsonArray.forEach(elem => {
		albums.innerHTML += `
		<h2 id="${elem.albName} data-albumId="$elem.id">
		${elem.albName}
		</h2>
		`

		albums.querySelector()
	})

	document.body.innerHTML += main.innerHTML
}

function getSongs() {
	const h2s = document.querySelectorAll('.song')
	h2s.forEach(() => {

	})
}

module.exports = {
	listAlbums
}