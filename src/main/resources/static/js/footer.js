const Footer = (function() {
	function Footer(copyright) {
		this.copyright = copyright
	}
	
	Footer.prototype = {
		render: function() {
			return `
				<footer>
					<small>${this.copyright}</small>
				</footer
		`
		}
	}

	return Footer
})()

module.exports = {
	Footer
}