const {makeElement} = require('./helpers')

const HomeWrapper = (function() {
	const homeWrapper = makeElement('div')
	homeWrapper.classList.add('wrapper')

	return homeWrapper
})()

module.exports = {
	HomeWrapper
}