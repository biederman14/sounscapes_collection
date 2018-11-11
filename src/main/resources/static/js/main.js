const Main = (function() {
	function Main() {}
	
	Main.prototype = {
		render: function() {
			return `
				<main>
					<h2>Sounscape Subheading</h2>
				</main>
			`
		}
	}

	return Main
})()

module.exports = {
	Main
}
