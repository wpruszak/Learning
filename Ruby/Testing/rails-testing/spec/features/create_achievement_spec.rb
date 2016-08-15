require 'rails_helper'
require_relative '../support/new_achievement_form'
require_relative '../support/login_form'

feature 'create_new_achievement' do

  let(:new_achievement_form) { NewAchievementForm.new }
  let(:login_form) { LoginForm.new }
  let(:user) {FactoryGirl.create(:user)}

  before do
    login_form.visit_page.login_as(user)
  end

  scenario 'create new achievement with valid data' do

    achievement_title = 'Read a book'

    new_achievement_form.visit_page.fill_in_with(
      title: achievement_title
    ).submit

    expect(page).to have_content('Achievement has been created')
    expect(Achievement.last.title).to eq(achievement_title)

  end

  scenario 'cannot create achievement with invalid data' do

    new_achievement_form.visit_page.submit
    expect(page).to have_content('can\'t be blank')

  end

end